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
var Observable_1 = require("rxjs/Observable");
require("rxjs/add/observable/of");
require("rxjs/add/observable/throw");
require("rxjs/add/operator/toPromise");
require("rxjs/add/operator/catch");
require("rxjs/add/operator/debounceTime");
require("rxjs/add/operator/distinctUntilChanged");
require("rxjs/add/operator/do");
require("rxjs/add/operator/filter");
require("rxjs/add/operator/map");
require("rxjs/add/operator/switchMap");
var MyFcaService = (function () {
    function MyFcaService(http) {
        this.http = http;
        this.userDetailUrl = ""; // /imiservices/app/resources/json/userdetail.json";
        this.contentTileUrl = "/app/resources/json/contenttiles.json";
        this.navbarUrl = "/app/resources/json/navbar.json";
        //private highchartUrl="http://localhost:3000/app/resources/json/highchart.json";
        this.highchartUrl = "/app/resources/json/demo3-highchart.json";
        this.localServiceJsonUrl = "/app/resources/json/newservice.json";
        this.serviceUrl = ""; ///imiservices/services/tileslistbyrole?role=2&id=S12345";
    }
    MyFcaService.prototype.getUsersData = function () {
        var myFcaUsers = this.http.get(this.userDetailUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return myFcaUsers;
    };
    MyFcaService.prototype.getContentTileData = function () {
        var contentTiles = this.http.get(this.contentTileUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return contentTiles;
    };
    MyFcaService.prototype.getNavbarData = function () {
        var navbarData = this.http.get(this.navbarUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return navbarData;
    };
    MyFcaService.prototype.getHighchartDataThroughJson = function () {
        var highchartData = this.http.get(this.highchartUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return highchartData;
    };
    MyFcaService.prototype.getTileDataThroughService = function () {
        var tileDataThroughService = this.http.get(this.serviceUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return tileDataThroughService;
    };
    MyFcaService.prototype.getTileDataThroughLocalJsonService = function () {
        var tileDataThroughService = this.http.get(this.localServiceJsonUrl)
            .map(function (response) { return response.json(); })
            .catch(this.handleError);
        return tileDataThroughService;
    };
    MyFcaService.prototype.extractData = function (res) {
        var body = res.json();
        return body.data || {};
    };
    MyFcaService.prototype.handleError = function (error) {
        // In a real world app, we might use a remote logging infrastructure
        var errMsg;
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
    MyFcaService.prototype.getData = function () {
        var headersObj = new http_1.Headers();
        //headers.append('Accept', 'application/json');
        headersObj.append('Access-Control-Allow-Headers', 'Content-Type');
        headersObj.append('Access-Control-Allow-Methods', 'GET');
        headersObj.append('Access-Control-Allow-Origin', '*');
        this.http
            .get("http://localhost:3000/app/json/jsonData.json", { headers: headersObj })
            .map(function (response) {
            console.log(response.json().data);
        })
            .catch(function (rr) { alert(); console.log(rr); return rr; }).subscribe(function (heroes) { return console.log(heroes); }, function (error) { return console.log(error); });
    };
    MyFcaService.prototype.getHighChartData = function () {
        return [
            {
                "order": 1,
                "title": "",
                "title_image": "app/resources/images/ph1.png",
                "data_image": "app/resources/images/panel1.png",
                "type": "tile",
                "data": [
                    {
                        "value": "8655",
                        "key": "Current Year's Program Level",
                        "type": "number"
                    },
                    {
                        "value": "5481",
                        "key": "Current Year's Program Points",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Check Status",
                        "type": "number"
                    },
                    {
                        "value": "",
                        "key": "Total Certified Participants YTD",
                        "type": "NUMBER"
                    },
                    {
                        "value": "442240",
                        "key": "Master Certified",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Certified Specialists",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Certified",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Dealership Rank for Total Master Certified",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Dealership Rank for Total Certified",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 2,
                "title": "BRAIN BOOST",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "0",
                        "key": "points awarded last week",
                        "type": "number"
                    },
                    {
                        "value": "125",
                        "key": "2016 program points",
                        "type": "number"
                    },
                    {
                        "value": "50",
                        "key": "Excellence card awards YTD",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 3,
                "title": "RAM EXPERT",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "1600",
                        "key": "Certified participants ",
                        "type": "number"
                    },
                    {
                        "value": "125",
                        "key": "total points earned YTD",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 4,
                "title": "PERFORMANCE INSTITUTE/ Most Valuable Professional",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "4WD Systems / 10 CDJR Technology / 15",
                        "key": "2017 Completed Competency",
                        "type": "string"
                    },
                    {
                        "value": "15",
                        "key": "CDJR Technology",
                        "type": "number"
                    },
                    {
                        "value": "9000",
                        "key": "2017 Excellence Card Award YTD",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 5,
                "title": "MSER-GENERIC",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "2030",
                        "key": "DEALERS ENROLLED",
                        "type": "number"
                    },
                    {
                        "value": "601385",
                        "key": "EXCELLENCE CARD AWARDS MTD",
                        "type": "number"
                    },
                    {
                        "value": "2815200",
                        "key": "EXCELLENCE CARD AWARDS YTD",
                        "type": "number"
                    },
                    {
                        "value": "TOP PERFORMERS",
                        "key": "BC Dealers Advisors Techs",
                        "type": "string"
                    }
                ]
            },
            {
                "order": 6,
                "title": "TOP ADVISORS",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "1579",
                        "key": "ENROLLED",
                        "type": "number"
                    },
                    {
                        "value": "Northeast 68.7%",
                        "key": "Top BC Enrolled",
                        "type": "string"
                    }
                ]
            },
            {
                "order": 7,
                "title": "TOP TECH",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "8655",
                        "key": "ENROLLED",
                        "type": "number"
                    },
                    {
                        "value": "Northeast 68.7%",
                        "key": "Top BC Enrolled",
                        "type": "string"
                    }
                ]
            },
            {
                "order": 8,
                "title": "SERVICE INCENTIVE REWARDS",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "Northeast",
                        "key": "Top BC Enrolled",
                        "type": "string"
                    },
                    {
                        "value": "5481",
                        "key": "Participants Enrolled",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Dealership Excellence Card Awards YTD",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 9,
                "title": "REWARDING EXCELLENCE VISA PREPAID CARD",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "3,409,510",
                        "key": "Total Cash Awards YTD",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 10,
                "title": "WINNING LIFESTYLE",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "8655",
                        "key": "DEALERS ENROLLED",
                        "type": "number"
                    },
                    {
                        "value": "5481",
                        "key": "# of Projected Trip winners",
                        "type": "number"
                    },
                    {
                        "value": "442240",
                        "key": "Projected Excellence Card Winners",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 11,
                "title": "Customer First",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "8655",
                        "key": "Inaugral Winner",
                        "type": "number"
                    },
                    {
                        "value": "5481",
                        "key": "Projected Winners (Current Year)",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 12,
                "title": "SUPER CELEBRATION",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "October-December 2016",
                        "key": "Program dates",
                        "type": "date"
                    },
                    {
                        "value": "125",
                        "key": "Vehicle Sold to Date",
                        "type": "number"
                    },
                    {
                        "value": "370,050",
                        "key": "Excellent Card Awards to Date",
                        "type": "number"
                    }
                ]
            },
            {
                "order": 13,
                "title": "DEALER SITE",
                "title_image": "",
                "data_image": "",
                "type": "tile",
                "data": [
                    {
                        "value": "",
                        "key": "Learn MORE",
                        "type": "string"
                    },
                    {
                        "value": "",
                        "key": "visit mopar.dealer.com",
                        "type": "string"
                    }
                ]
            },
            {
                "order": 13,
                "title": "DEALER SITE",
                "title_image": "",
                "data_image": "",
                "type": "chart",
                "data": {
                    credits: {
                        enabled: false
                    },
                    title: {
                        text: ''
                    },
                    xAxis: {
                        categories: [
                            '1',
                            '2',
                            '3',
                            '4',
                            '5',
                            '6',
                            '7',
                            '8',
                            '9',
                            '10',
                            '11',
                            '12',
                            '13',
                            '14',
                            '15',
                            '16',
                            '17',
                            '18',
                            '19',
                            '20',
                            '21',
                            '22',
                            '23',
                            '24',
                            '25',
                            '26',
                            '27',
                            '28',
                            '29',
                            '30',
                            '31'
                        ]
                    },
                    yAxis: {
                        min: 0,
                        title: {
                            text: 'Calls'
                        }
                    },
                    series: [
                        {
                            type: 'column',
                            name: 'ACD Calls',
                            data: [
                                43,
                                0,
                                0,
                                0,
                                64,
                                49,
                                51,
                                39,
                                0,
                                0,
                                38,
                                39,
                                24,
                                41,
                                32,
                                0,
                                0,
                                35,
                                38,
                                27,
                                33,
                                29,
                                0,
                                0,
                                24,
                                38,
                                35,
                                24,
                                27,
                                0,
                                0
                            ]
                        },
                        {
                            type: 'column',
                            name: 'Non ACD Calls',
                            data: [
                                18,
                                0,
                                0,
                                0,
                                15,
                                31,
                                33,
                                15,
                                0,
                                0,
                                20,
                                15,
                                17,
                                11,
                                11,
                                0,
                                0,
                                9,
                                14,
                                10,
                                5,
                                8,
                                0,
                                0,
                                6,
                                8,
                                7,
                                11,
                                6,
                                0,
                                0
                            ]
                        }
                    ],
                    navigation: {
                        buttonOptions: {
                            theme: {
                                // Good old text links 
                                style: {
                                    color: '#039',
                                    textDecoration: 'underline'
                                }
                            }
                        }
                    }
                }
            },
            {
                "order": 13,
                "title": "DEALER SITE",
                "title_image": "",
                "data_image": "",
                "type": "chart",
                "data": {
                    chart: {
                        type: 'pie'
                    },
                    title: {
                        text: ''
                    },
                    plotOptions: {
                        series: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: true,
                                format: '{point.name}, {point.y}%'
                            }
                        }
                    },
                    tooltip: {
                        headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
                        pointFormat: '<span style="color:{point.color}"><b>{point.name}</b></span>, <b>{point.y}%</b><br/>'
                    },
                    series: [
                        {
                            name: 'Groups',
                            colorByPoint: true,
                            data: [
                                {
                                    name: 'CDJR Certified, 33919',
                                    y: 89,
                                    drilldown: 'CDJR'
                                },
                                {
                                    name: 'FIAT Certified, 3497',
                                    y: 9 //                                                                drilldown:'FIAT'
                                },
                                {
                                    name: 'Alfa Certified, 587',
                                    y: 2
                                }
                            ]
                        }
                    ],
                    drilldown: {
                        series: [
                            {
                                id: 'CDJR',
                                name: 'CDJR',
                                colorByPoint: true,
                                data: [
                                    {
                                        name: 'Sales, 17621',
                                        y: 52,
                                        drilldown: 'CDJR Sales'
                                    },
                                    {
                                        name: 'Aftersales, 7703',
                                        y: 23 //                                                                    drilldown:'CDJR After Sales'
                                    },
                                    {
                                        name: 'Technicians, 8595',
                                        y: 25,
                                        drilldown: 'CDJR Technicians'
                                    }
                                ]
                            },
                            {
                                id: 'CDJR Sales',
                                name: 'CDJR Sales',
                                data: [
                                    [
                                        'Certified, 11520',
                                        65
                                    ],
                                    [
                                        'Certified Specialist, 1140',
                                        7
                                    ],
                                    [
                                        'Master, 1454',
                                        8
                                    ],
                                    [
                                        'Sales Manager, 2324',
                                        13
                                    ],
                                    [
                                        'Sales Commercial, 1183',
                                        7
                                    ]
                                ]
                            },
                            {
                                id: 'CDJR After Sales',
                                name: 'CDJR After Sales',
                                data: [
                                    {
                                        name: 'Certified',
                                        y: 35,
                                        drilldown: 'CDJR After Sales Certified'
                                    },
                                    {
                                        name: 'Certified Specialist',
                                        y: 18,
                                        drilldown: 'CDJR After Sales Certified Specialist'
                                    },
                                    {
                                        name: 'Master',
                                        y: 11,
                                        drilldown: 'CDJR After Sales Master'
                                    }
                                ]
                            },
                            {
                                id: 'CDJR After Sales Certified',
                                name: 'CDJR After Sales Certified',
                                data: [
                                    [
                                        'Service Advisor',
                                        22
                                    ],
                                    [
                                        'Service Manager',
                                        39
                                    ],
                                    [
                                        'Parts Advisor',
                                        42
                                    ],
                                    [
                                        'Parts Manager',
                                        42
                                    ],
                                    [
                                        'Warranty Administrator',
                                        50
                                    ]
                                ]
                            },
                            {
                                id: 'CDJR After Sales Certified Specialist',
                                name: 'CDJR After Sales Certified Specialist',
                                data: [
                                    [
                                        'Service Advisor',
                                        9
                                    ],
                                    [
                                        'Service Manager',
                                        34
                                    ],
                                    [
                                        'Parts Advisor',
                                        15
                                    ],
                                    [
                                        'Parts Manager',
                                        36
                                    ],
                                    [
                                        'Warranty Administrator',
                                        17
                                    ]
                                ]
                            },
                            {
                                id: 'CDJR After Sales Master',
                                name: 'CDJR After Sales Master',
                                data: [
                                    [
                                        'Service Advisor',
                                        14
                                    ],
                                    [
                                        'Service Manager',
                                        1
                                    ],
                                    [
                                        'Parts Advisor',
                                        12
                                    ],
                                    [
                                        'Parts Manager',
                                        1
                                    ],
                                    [
                                        'Warranty Administrator',
                                        18
                                    ]
                                ]
                            },
                            {
                                id: 'CDJR Technicians',
                                name: 'CDJR Technicians',
                                data: [
                                    [
                                        'Certified, 4098',
                                        68
                                    ],
                                    [
                                        'Certified Specialist, 590',
                                        10
                                    ],
                                    [
                                        'Master, 1291',
                                        22
                                    ]
                                ]
                            },
                            {
                                id: 'FIAT',
                                name: 'FIAT',
                                colorByPoint: true,
                                data: [
                                    {
                                        name: 'Sales Certified',
                                        y: 76,
                                        drilldown: 'FIAT Sales'
                                    },
                                    {
                                        name: 'Aftersales Certified',
                                        y: 62,
                                        drilldown: 'FIAT After Sales'
                                    },
                                    {
                                        name: 'Technicians',
                                        y: 48,
                                        drilldown: 'FIAT Technicians'
                                    }
                                ]
                            },
                            {
                                id: 'FIAT Sales',
                                name: 'FIAT Sales',
                                data: [
                                    [
                                        'Certified',
                                        73
                                    ],
                                    [
                                        'Certified Specialist',
                                        3
                                    ],
                                    [
                                        'Master',
                                        1
                                    ],
                                    [
                                        'Sales Manager Certified',
                                        71
                                    ]
                                ]
                            },
                            {
                                id: 'FIAT After Sales',
                                name: 'FIAT After Sales',
                                data: [
                                    {
                                        name: 'Certified',
                                        y: 33,
                                        drilldown: 'FIAT After Sales Certified'
                                    },
                                    {
                                        name: 'Certified Specialist',
                                        y: 9,
                                        drilldown: 'FIAT After Sales Certified Specialist'
                                    },
                                    {
                                        name: 'Master',
                                        y: 19,
                                        drilldown: 'FIAT After Sales Master'
                                    }
                                ]
                            },
                            {
                                id: 'FIAT After Sales Certified',
                                name: 'After Sales Certified',
                                data: [
                                    [
                                        'Service Advisor',
                                        27
                                    ],
                                    [
                                        'Service Manager',
                                        31
                                    ],
                                    [
                                        'Parts Advisor',
                                        26
                                    ],
                                    [
                                        'FIAT Parts Manager',
                                        48
                                    ],
                                    [
                                        'Warranty Administrator',
                                        32
                                    ]
                                ]
                            },
                            {
                                id: 'FIAT After Sales Certified Specialist',
                                name: 'After Sales Certified Specialist',
                                data: [
                                    [
                                        'Service Advisor',
                                        5
                                    ],
                                    [
                                        'Service Manager',
                                        12
                                    ],
                                    [
                                        'Parts Advisor',
                                        13
                                    ],
                                    [
                                        'Parts Manager',
                                        9
                                    ],
                                    [
                                        'Warranty Administrator',
                                        9
                                    ]
                                ]
                            },
                            {
                                id: 'FIAT After Sales Master',
                                name: 'After Sales Master',
                                data: [
                                    [
                                        'Service Advisor',
                                        21
                                    ],
                                    [
                                        'Service Manager',
                                        31
                                    ],
                                    [
                                        'Parts Advisor',
                                        21
                                    ],
                                    [
                                        'Parts Manager',
                                        13
                                    ],
                                    [
                                        'Warranty Administrator',
                                        15
                                    ]
                                ]
                            },
                            {
                                id: 'FIAT Technicians',
                                name: 'FIAT Technicians',
                                data: [
                                    [
                                        'Technician Certified',
                                        48
                                    ],
                                    [
                                        'Technician Certified Specialist',
                                        0
                                    ],
                                    [
                                        'Technician Master',
                                        0
                                    ]
                                ]
                            }
                        ]
                    }
                }
            }
        ];
    };
    return MyFcaService;
}());
MyFcaService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.Http])
], MyFcaService);
exports.MyFcaService = MyFcaService;
//# sourceMappingURL=app.component.service.js.map