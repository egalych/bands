'use strict';
(function (angular) {
    angular.module('bands', ['ui.router', 'bandsController', 'bandsService']);
    angular.module('bands').config(function($stateProvider) {
        $stateProvider.state('bands', {
            url: '/bands',
            templateUrl: 'views/bands.html',
            controller: 'bandsController'
        }).state('new', {
            url: '/bands/new',
            templateUrl: 'views/band-new.html',
            controller: 'bandsController'
        })
    }).run(function($state) {
        $state.go('bands');
    });
}(angular));