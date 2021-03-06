"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var http_1 = require("@angular/http");
var login_service_1 = require("../../services/login-services/login.service");
var LoginComponent = (function () {
    function LoginComponent(loginService, router, http) {
        this.loginService = loginService;
        this.router = router;
        this.http = http;
        this.sampleUsers = [];
        this.userdata = {};
        this.responseUserdata = {
            "data": {
                "token": "",
                "status": false
            },
            "error": ""
        };
    }
    LoginComponent.prototype.ngOnInit = function () {
        this.user = {
            username: '',
            password: ''
        };
    };
    LoginComponent.prototype.login = function (username, password) {
        var _this = this;
        this.loginService.getLoginResponse(this.user.username, this.user.password).subscribe(function (resUserData) {
            _this.userdata = (resUserData);
            // alert(resUserData["userID"]);
            if (resUserData["token"].length > 0) {
                _this.loginService.setUserData(_this.userdata);
                var poscodes = _this.userdata.positionCode;
                var delcodes = _this.userdata.dealerCode;
                //var poscodes: any = JSON.parse(sessionStorage.getItem("CurrentUser")).positionCode;
                // var delcodes: any = JSON.parse(sessionStorage.getItem("CurrentUser")).dealerCode;
                sessionStorage.setItem("selectedCodeData", JSON.stringify({
                    "selectedPositionCode": poscodes === undefined ? 0 : poscodes[0] === "" ? "0" : poscodes.length > 0 ? poscodes[0] : 0,
                    "selectedDealerCode": delcodes === undefined ? 0 : delcodes[0] === "" ? "0" : delcodes.length > 0 ? delcodes[0] : 0
                }));
                var url = ["myfcadashboard"];
                _this.router.navigate(url);
            }
            else {
                alert("invalid user");
            }
            // var msg = JSON.parse(resUserData["error"])["error"];
            // alert(msg);
        });
    };
    return LoginComponent;
}());
LoginComponent = __decorate([
    core_1.Component({
        moduleId: module.id,
        templateUrl: './loginform.html',
    }),
    __metadata("design:paramtypes", [login_service_1.LoginService, router_1.Router, http_1.Http])
], LoginComponent);
exports.LoginComponent = LoginComponent;
//# sourceMappingURL=login.component.js.map