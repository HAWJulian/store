/**
 * Created by tmichels on 8/3/14.
 */

var StoreController = function($scope, $http) {
	index = 0;
	// probably not needed since we probably wont calculate the total cost
	$scope.totalCost = 0;
	// fetches the store/all.json from StoreController.java (which returns all
	// products defined @StoreServiceImpl)
	$scope.viewAllProducts = function() {
		$http.get('store/all.json').success(function(response) {
			$scope.items = response.products;
			$scope.categories = response.categories;
			console.log($scope.categories);
			$scope.applyColors($scope.items);
			$scope.applyColors($scope.categories);
		})
	}
	// applies a color attribute to the elements in the list in which the items
	// will be displayed in the grid
	$scope.applyColors = function(list) {
		// condition for different coloring
		if (typeof list[0].price !== 'undefined') {
			var color = 'red';
			for (var i = 0; i < list.length; i++) {
				list[i].color = color;

			}
		} else {
			for (var j = 0; j < list.length; j++) {
				if (list[j].subcategory) {
					list[j].color = 'green';
				} else {
					list[j].color = 'blue'	;
				}
			}
		}
	}
	// call the viewAllProducts function on js load
	$scope.viewAllProducts()
	/*
	 * setTimeout(function() { console.log($scope.items);
	 * $scope.applyColors($scope.items); }, 2000);
	 */
	// $scope.applyColors($scope.items);
	// $scope.applyColors($scope.categories);
	// defines the products in a customers cart
	$scope.cart = [];
	// adds x amount of y item to the cart and updates the total cost
	$scope.submit = function(item) {
		item.index = index;
		index++;

		if (!item.wasAdded) {
			$scope.cart.push(item);
			item.amount = 0;
		}
		item.amount += item.newamount;
		item.wasAdded = true;

		$scope.totalCost += item.newamount * item.price;
	}

}