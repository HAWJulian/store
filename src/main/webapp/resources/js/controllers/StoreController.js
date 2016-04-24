/**
 * Created by tmichels on 8/3/14.
 */

var StoreController = function($scope, $http) {
	index = 0;
	$scope.items = [ {
		name : 'Käse',
		price : 1000,
		make : 'Ja!',
		needsCooling : true,
		image: "resources/images/3.png"
	}, {
		name : 'Wurst',
		price : 10,
		make : 'Nein?',
		needsCooling : false,
		image: "resources/images/10.png"
	}, {
		name : 'Marmelade',
		price : 2,
		make : 'Schwartau',
		needsCooling : true,
		image: "resources/images/21.png"
	} ];
	
	$scope.cart = [];
	//optional TODO: only add item to cart if item does not exist in cart
	//else only update amount
	$scope.submit = function (item) {
		item.index = index;
		index++;
		$scope.cart.push(item);
	}

}