/**
 * Created by tmichels on 8/3/14.
 */

var StoreController = function($scope, $http) {
	index = 0;
	$scope.totalCost = 0;
	/*
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
	*/
	$scope.viewAllProducts = function(){
        $http.get('store/all.json').success(function(response){
            $scope.items = response;
        })
    }
	$scope.viewAllProducts();
	$scope.cart = [];
	//TODO: implement with controller
	$scope.submit = function (item) {
		item.index = index;
		index++;
		
		if(!item.wasAdded)
		{
			$scope.cart.push(item);
			item.amount = 0;
		}
		item.amount += item.newamount;
		item.wasAdded = true;
		
		$scope.totalCost += item.newamount * item.price;
	}

}