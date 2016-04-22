'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.service', 'AngularSpringApp.directives', 'ngRoute', 'ui.bootstrap', 'ngTable', 'ui.ace', 'angularFileUpload', 'nvd3ChartDirectives']);

// Declare app level module which depends on filters, and service
App.config(['$routeProvider', function ($routeProvider) {

    $routeProvider.when('/todo', {
        templateUrl: 'todo/layout',
        controller: TodoController
    });
    $routeProvider.when('/address', {
        templateUrl: 'address/layout',
        controller: AddressBookController
    });
    $routeProvider.when('/table', {
        templateUrl: 'table/layout',
        controller: TableController
    });
    $routeProvider.when('/tabs', {
        templateUrl: 'tabs/layout',
        controller: TabsController
    })

    $routeProvider.when('/file', {
        templateUrl: 'file/layout',
        controller: FileController
    });
    $routeProvider.when('/editor', {
        templateUrl: 'editor/layout',
        controller: EditorController
    });
    $routeProvider.when('/restangular', {
        templateUrl: 'restangular/layout',
        controller: RestController
    });
    $routeProvider.when('/force', {
        templateUrl: 'force/layout',
        controller: ForceController
    });
    $routeProvider.when('/d3', {
        templateUrl: 'd3/layout',
        controller: D3Controller
    });
    $routeProvider.when('/store', {
        templateUrl: 'store/layout',
        controller: StoreController
    })

    $routeProvider.otherwise({redirectTo: '/todo'});
}], ['$httpProvider', function ($httpProvider) {
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
    $httpProvider.defaults.headers.post['Accept'] = 'application/json, text/javascript';
    $httpProvider.defaults.headers.post['Content-Type'] = 'application/json; charset=utf-8';
    $httpProvider.defaults.headers.post['Access-Control-Max-Age'] = '1728000';
    $httpProvider.defaults.headers.common['Access-Control-Max-Age'] = '1728000';
    $httpProvider.defaults.headers.common['Accept'] = 'application/json, text/javascript';
    $httpProvider.defaults.headers.common['Content-Type'] = 'application/json; charset=utf-8';
    $httpProvider.defaults.useXDomain = true;
}]);
