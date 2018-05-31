var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request18 = [];
    var premier= "premier";

    $http.get('http://localhost:8080/request/request18?premier='+premier).then(function (response){
        $scope.request18=response.data;
        console.log(response);
       $http.get('/shows/get').then(function (response){
            var shows = response.data;
            var selector = document.getElementById("Shows");
            $(selector).empty();
            for (var i = 0; i < shows.length; i++) {
                var option = document.createElement("option");
                option.text = shows[i].premier;
                option.value = shows[i].premier;
                selector.add(option);
            }
            //selector.selectedIndex=0;
            selector.selectedIndex=2;
        });
       document.getElementById("premier").value = premier;

    });

    this.update_request = function add() {
         var index = document.getElementById("Shows").selectedIndex;
        var premier= document.getElementById("Shows").options[index].value;


        $http.get('http://localhost:8080/request/request18?premier='+premier).then(function (response){
            $scope.request18=response.data;
            console.log(response);
        });
    };
});