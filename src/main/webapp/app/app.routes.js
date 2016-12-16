"use strict";
var router_1 = require("@angular/router");
var login_component_1 = require("./ts/login/login.component");
var app_view_component_1 = require("./app.view.component");
var app_contentbody_component_1 = require("./ts/contentbody/app.contentbody.component");
var appRoutes = [{
        path: "myfcadashboard",
        component: app_view_component_1.ViewComponent
    }, {
        path: "app.component",
        component: app_contentbody_component_1.ContentSection
    }, {
        path: "login",
        component: login_component_1.LoginComponent
    },];
exports.appRoutingProviders = [];
exports.routing = router_1.RouterModule.forRoot(appRoutes);
//# sourceMappingURL=app.routes.js.map