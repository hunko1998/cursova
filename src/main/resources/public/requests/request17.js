var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request17 = [];
    var subtype= "30";

    $http.get('http://localhost:8080/request/request17?subtype='+subtype).then(function (response){
        $scope.request17=response.data;
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
*/        document.getElementById("subtype").value = subtype;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        subtype = document.getElementById("subtype").value;

        $http.get('http://localhost:8080/request/request17?subtype='+subtype).then(function (response){
            $scope.request17=response.data;
            console.log(response);
        });
    };
});