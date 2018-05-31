var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request12 = [];
    var author= "Stepan";

    $http.get('http://localhost:8080/request/request12?author='+author).then(function (response){
        $scope.request12=response.data;
        console.log(response);
        /*$http.get('/storageplace/get').then(function (response){
            var storageplace = response.data;
            var selector = document.getElementById("StoragePlace");
            $(selector).empty();
            for (var i = 0; i < storageplace.length; i++) {
                var option = document.createElement("option");
                option.text = storageplace[i].idStoragePlace;
                option.value = storageplace[i].idStoragePlace;
                selector.add(option);
            }
            //selector.selectedIndex=0;
            selector.selectedIndex=2;
        });
*/        document.getElementById("author").value = author;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        author = document.getElementById("author").value;

        $http.get('http://localhost:8080/request/request12?author='+author).then(function (response){
            $scope.request12=response.data;
            console.log(response);
        });
    };
});