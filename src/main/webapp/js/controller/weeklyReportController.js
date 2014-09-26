
module.controller('WeeklyReportController', ['$scope','WeekReportService',function($scope, WeekReportService){
     WeekReportService.getList().success(function(data){
         $scope.list = data;
     });

}]);

