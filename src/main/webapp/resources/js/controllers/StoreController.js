/**
 * Created by tmichels on 8/3/14.
 */

var StoreController = function($scope, $http) {

	$scope.items = [ {
		name : 'Käse',
		price : 1000,
		make : 'Ja!',
		needsCooling : true,
		//image: "./images/3.png"
	}, {
		name : 'Wurst',
		price : 10,
		make : 'Nein?',
		needsCooling : false,
		//image: "./images/10.png"
	}, {
		name : 'Marmelade',
		price : 2,
		make : 'Schwartau',
		needsCooling : true,
		//image: "./images/21.png"
	} ];

}