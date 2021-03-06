/**
 * Created by greg.chen on 14-9-26.
 */
module.service('WeeklyReportService',['$http',function($http){
    var list;

    this.getList = function(){
        //只返回request对象
        return $http.get('/report-list');
    }

    this.save = function(weeklyReport){
        return $http.post('/report/add', weeklyReport);
    }

    this.delete = function(id){
        return $http.delete('/report/delete/'+id);
    }

}]);