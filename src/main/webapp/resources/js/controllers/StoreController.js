/**
 * Created by tmichels on 8/3/14.
 */

var StoreController = function($scope, $http) {
	index = 0;
	//probably not needed since we probably wont calculate the total cost
	$scope.totalCost = 0;
	
	//fetches the store/all.json from StoreController.java (which returns all products defined @StoreServiceImpl)
	$scope.viewAllProducts = function(){
        $http.get('store/all.json').success(function(response){
            $scope.items = response.products;
            $scope.categories = response.categories;
        })
    }
	//call the viewAllProducts function on js load
	$scope.viewAllProducts();
	//currently defines the products in a customers cart
	$scope.cart = [];
	//adds x amount of y item to the cart and updates the total cost
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