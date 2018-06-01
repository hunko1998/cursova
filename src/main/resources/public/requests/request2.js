var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request2 = [];
    var experience= 'senior';

    $http.get('/request/request2?experience='+experience).then(function (response){
        $scope.request2=response.data;
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
*/        document.getElementById("experience").value = experience;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        experience = document.getElementById("experience").value;

        $http.get('/request/request2?experience='+experience).then(function (response){
            $scope.request2=response.data;
            console.log(response);
        });
    };
});