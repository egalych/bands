'use strict';
(function (angular) {
    angular.module('bandsService', []).service('bandsService', function ($http) {
        this.bands = function () {
            return $http.get('bands').then(function (result) {
                return result.data._embedded.bands;
            })
        }
        this.addBand = function(band) {
            return $http.post("bands", band);
        }
    })
}(angular));