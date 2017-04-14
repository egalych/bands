'use strict';
(function (angular) {
    angular.module('bandsController', []).controller('bandsController', function ($scope, $state, bandsService) {
        $scope.bands = [];
        bandsService.bands().then(function (data) {
            $scope.bands = data;
        });
        $scope.addBand = function() {
            alert("Implement me!");
            $state.go('bands');
        };
    })
}(angular));