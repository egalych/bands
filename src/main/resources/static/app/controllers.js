'use strict';
(function (angular) {
    angular.module('bandsController', []).controller('bandsController', function ($scope, $state, bandsService) {
        $scope.bands = [];
        $scope.band = {};
        bandsService.bands().then(function (data) {
            $scope.bands = data;
        });
        $scope.addBand = function () {
            bandsService.addBand($scope.band).then(function () {
                $state.go('bands');
            })
        };
    })
}(angular));