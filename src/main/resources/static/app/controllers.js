'use strict';
(function (angular) {
    angular.module('bandsController', []).controller('bandsController', function ($scope, bandsService) {
        $scope.bands = [];
        bandsService.bands().then(function (data){
            $scope.bands = data;
        });
    })
}(angular));