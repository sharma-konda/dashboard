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
var http_1 = require("@angular/http");
var admin_service_1 = require("../../services/admin-services/admin.service");
var Observable_1 = require("rxjs/Observable");
var forms_1 = require("@angular/forms");
var AdminComponent = (function () {
    function AdminComponent(http, adminService, elRef) {
        this.http = http;
        this.adminService = adminService;
        this.elRef = elRef;
        this.banners = new Array;
        // public sid: any;
        this.edited = false;
        this.getAdminResponseUrl = './app/resources/json/admin-data.json';
        this.selectedCheckBox = {};
        this.clickSuccessMessage = '';
    }
    AdminComponent.prototype.ngOnInit = function () {
        this.data = JSON.parse(sessionStorage.getItem("CurrentUser"));
    };
    AdminComponent.prototype.onClickEvent = function (e) {
        // console.log(e);
        e.stopPropagation();
        // console.log(this.selectedCheckBox);
    };
    AdminComponent.prototype.OnSave = function () {
        event.preventDefault();
        document.body.scrollTop = 0;
        this.clickSuccessMessage = "Success! Data saved successfully";
    };
    AdminComponent.prototype.OnCancel = function (admin, e) {
        var c = confirm("Do you want to Cancel");
        if (c === true) {
            event.preventDefault();
            // window.location.href='http://localhost:3000/admin'
            this.f.reset();
            // this.
            console.log(admin);
            console.log(e);
        }
        else {
            event.preventDefault();
        }
    };
    AdminComponent.prototype.getAccordionData = function () {
        this.accordionData = [
            {
                "accordionTitle": "MSER",
                'order': "1",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Excellence Cards Awards MTD", 'checked': false },
                    { "name": "mser-opt3", "title": "Excellence Cards Awards YTD", 'checked': false },
                ]
            },
            {
                "accordionTitle": "MSER Graph",
                "order": "2",
                data: [
                    { "name": "mser-opt1", "title": "uConnect", 'checked': false },
                    { "name": "mser-opt2", "title": "wiAdvisor", 'checked': false },
                    { "name": "mser-opt3", "title": "Express Lane", 'checked': false },
                    { "name": "mser-opt4", "title": "Parts Counter", 'checked': false },
                    { "name": "mser-opt5", "title": "Magenti Marelli", 'checked': false },
                    { "name": "mser-opt6", "title": "MVP", 'checked': false },
                    { "name": "mser-opt7", "title": "Mopar Parts", 'checked': false },
                ]
            },
            {
                "accordionTitle": "Top Tech",
                "order": "3",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Top Performers", 'checked': false },
                    { "name": "mser-opt3", "title": "Count of Surveys QTD", 'checked': false },
                    { "name": "mser-opt4", "title": "Average Quarterly Survey Score", 'checked': false }
                ]
            },
            {
                "accordionTitle": "Top Advisor",
                "order": "4",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Count of Surveys QTD", 'checked': false },
                    { "name": "mser-opt3", "title": "Incentive Eligible Advisors", 'checked': false },
                    { "name": "mser-opt4", "title": "Average Quarterly Survey Score", 'checked': false }
                ]
            },
            {
                "accordionTitle": "Top Tech/Advisor Graph",
                "order": "5",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Count of Surveys QTD", 'checked': false },
                    { "name": "mser-opt3", "title": "Incentive Eligible Advisors", 'checked': false },
                    { "name": "mser-opt4", "title": "Average Quarterly Survey Score", 'checked': false }
                ]
            },
            {
                "accordionTitle": "Retention",
                "order": "6",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Count of Surveys QTD", 'checked': false },
                    { "name": "mser-opt3", "title": "Incentive Eligible Advisors", 'checked': false },
                    { "name": "mser-opt4", "title": "Average Quarterly Survey Score", 'checked': false }
                ]
            },
            {
                "accordionTitle": "Retention Graph",
                "order": "7",
                data: [
                    { "name": "mser-opt1", "title": "Total Dealers Enrolled", 'checked': false },
                    { "name": "mser-opt2", "title": "Count of Surveys QTD", 'checked': false },
                    { "name": "mser-opt3", "title": "Incentive Eligible Advisors", 'checked': false },
                    { "name": "mser-opt4", "title": "Average Quarterly Survey Score", 'checked': false }
                ]
            }
        ];
    };
    // toggleItem(chapter) {
    //     console.log(chapter);
    //     chapter.checked = !chapter.checked
    //     console.log(chapter);
    // }
    AdminComponent.prototype.toggleAll = function (ev) {
        this.parentId = ev.target.value;
        var dataLength = this.accordionData.length;
        if (this.parentId === this.parentId) {
            if (this.parentId === "1") {
                var SubDataLeng = 3;
            }
            if (this.parentId === "2") {
                var SubDataLeng = 7;
            }
            if (this.parentId === "3") {
                var SubDataLeng = 4;
            }
            if (this.parentId === "4" || this.parentId === "5" || this.parentId === "6" || this.parentId === "7") {
                var SubDataLeng = 4;
            }
            // if ($('input.header').is(':checked')) {
            if (ev.target.checked === true) {
                for (var j = 0; j <= SubDataLeng; j++) {
                }
            }
            else {
                for (var j = 0; j <= SubDataLeng; j++) {
                    if ($(".card-block" + this.parentId + " input#mser-opt" + j).prop('checked', true)) {
                        $(".card-block" + this.parentId + " input#mser-opt" + j).prop('checked', false);
                    }
                }
            }
        }
    };
    AdminComponent.prototype.uncheckParent = function (ev) {
        this.parentId = ev.target.value;
        var totoalChkedChbox = $('.card-block' + this.parentId + ' input:checkbox:checked').length;
        if (this.parentId === "1") {
            var SubDataLeng = 3;
        }
        if (this.parentId === "2") {
            var SubDataLeng = 7;
        }
        if (this.parentId === "3") {
            var SubDataLeng = 4;
        }
        if (this.parentId === "4" || this.parentId === "5" || this.parentId === "6" || this.parentId === "7") {
            var SubDataLeng = 4;
        }
        if (ev.currentTarget.checked == true) {
            if (ev.target.value) {
                //   if($("#header"+ev.target.value).is(":checked")) {
                $("#header" + ev.target.value).prop("checked", true);
            }
        }
        if (totoalChkedChbox === 0) {
            $("#header" + ev.target.value).prop("checked", false);
        }
    };
    AdminComponent.prototype.onBlurMethod = function (sid, body) {
        console.log(this.sid);
        if (this.sid) {
            this.getAccordionData();
        }
        var bodyString = JSON.stringify(body); // Stringify payload
        var headers = new http_1.Headers({ 'Content-Type': 'application/json' }); // ... Set content type to JSON
        var options = new http_1.RequestOptions({ headers: headers }); // Create a request option
        this.edited = true;
        var adminData = "./app/resources/json/serviceJson/admin-data.json";
        var AdminDataThroughService = this.http.post(adminData, body, options)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return AdminDataThroughService;
    };
    AdminComponent.prototype.getAdminData = function () {
        var adminData = "./app/resources/json/serviceJson/admin-data.json";
        var AdminDataThroughService = this.http.get(adminData)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return AdminDataThroughService;
    };
    AdminComponent.prototype.handleError = function (error) {
        var errMsg = "";
        if (error instanceof http_1.Response) {
            var body = error.json() || '';
            var err = body.error || JSON.stringify(body);
            errMsg = error.status + " - " + (error.statusText || '') + " " + err;
        }
        else {
            errMsg = error.message ? error.message : error.toString();
        }
        return Observable_1.Observable.throw(errMsg);
    };
    return AdminComponent;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", Object)
], AdminComponent.prototype, "data", void 0);
__decorate([
    core_1.ViewChild('f'),
    __metadata("design:type", forms_1.FormGroup)
], AdminComponent.prototype, "f", void 0);
AdminComponent = __decorate([
    core_1.Component({
        moduleId: module.id,
        selector: "app-admin",
        templateUrl: "./admin.html"
    }),
    __metadata("design:paramtypes", [http_1.Http, admin_service_1.AdminService, core_1.ElementRef])
], AdminComponent);
exports.AdminComponent = AdminComponent;
//# sourceMappingURL=admin.component.js.map