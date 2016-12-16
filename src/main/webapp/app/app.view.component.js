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
var app_component_service_1 = require("./app.component.service");
require("./rxjs-operators");
var ViewComponent = (function () {
    function ViewComponent(service, router, http) {
        this.service = service;
        this.router = router;
        this.http = http;
        this.sampleUsers = [];
        this.userdata = {};
    }
    ViewComponent.prototype.ngOnInit = function () {
        this.userdata = this.service.getUsersData();
        this.tilesArray = this.service.getTiles();
    };
    return ViewComponent;
}());
ViewComponent = __decorate([
    core_1.Component({
        moduleId: module.id,
        selector: 'my-app',
        templateUrl: './app.component.html',
        //templateUrl: './login.html',
        providers: [app_component_service_1.MyFcaService]
    }),
    __metadata("design:paramtypes", [app_component_service_1.MyFcaService, router_1.Router, http_1.Http])
], ViewComponent);
exports.ViewComponent = ViewComponent;
//# sourceMappingURL=app.view.component.js.map