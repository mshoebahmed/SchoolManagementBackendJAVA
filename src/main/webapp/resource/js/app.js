
console.log("hello");
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
  $routeProvider
  .when("/", {
    templateUrl : "resource/html/addStudent.jsp",
    controller : "londonCtrl"
  })
  .when("/london", {
    templateUrl : "london.htm",
    controller : "londonCtrl"
  })
  .when("/paris", {
    templateUrl : "paris.htm",
    controller : "parisCtrl"
  });
});
app.controller("londonCtrl", function ($scope) {
  $scope.msg = "I love London";
});
app.controller("parisCtrl", function ($scope) {
  $scope.msg = "I love Paris";
});