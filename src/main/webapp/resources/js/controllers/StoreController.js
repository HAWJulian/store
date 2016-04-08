/**
 * Created by tmichels on 8/3/14.
 */


var StoreController = function($scope, $http){

	$scope.items = [
	                {
	                	name: 'Käse',
	                	price: 1000,
	                	make: 'Ja!',
	                	needsCooling: true
	                },
	                {
	                	name: 'Wurst',
	                	price: 10,
	                	make: 'Nein?',
	                	needsCooling: false
	                },
	                {
	                	name: 'Marmelade',
	                	price: 2,
	                	make: 'Schwartau',
	                	needsCooling: true
	                }
	                ];
    
}