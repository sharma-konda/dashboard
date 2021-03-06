import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, HttpModule } from '@angular/http';
import { Observable } from 'rxjs/Observable'
import './../rxjs-operators';

@Injectable()
export class DashboardBodyService {
    private tiles = new Array();
    private userdata = {}
    constructor(private http: Http) { }

    setTiles(tiles) {
        sessionStorage.setItem("tiles", JSON.stringify(tiles));
    }
    getTiles() {
        return this.tiles;
    }
    setUserData(userdata: any) {
        sessionStorage.setItem("CurrentUser", JSON.stringify(userdata));
    }
    getUsersData() {
        return this.userdata;
    }
    getNumberOfTiltes() {
        var validToken: any = JSON.parse(sessionStorage.getItem("CurrentUser")).token;
        var positioncodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedPositionCode;
        var dealerlcodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedDealerCode;
        var getNumberOfTilesServiceUrl: string = "services/notile/" + positioncodes + "/" + dealerlcodes;
        // var getNumberOfTilesServiceUrl: string = "http://172.24.16.75:9080/imiservices/services/notile/" + positioncodes + "/" + dealerlcodes;
        // var getNumberOfTilesServiceUrl: string = "./app/resources/json/notiles.json";
        //  var getNumberOfTilesServiceUrl: string = "./app/resources/json/cutomer-notiles.json";
        var headers = new Headers();
        headers.append('Authorization', validToken);
        return this.http.get(getNumberOfTilesServiceUrl, { headers })
            .map((response: Response) => response.json())
            .catch(this.handleError);
    }
    getTilteJson(id?) {
        var validToken: any = JSON.parse(sessionStorage.getItem("CurrentUser")).token;
        var positioncodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedPositionCode;
        var dealerlcodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedDealerCode;
        var headers = new Headers();
        headers.append('Authorization', validToken);

        //var tileService = "./app/resources/dc-json/" + id + "-tile.json";
        var tileService = "services/tile/" + id + "/" + positioncodes + "/" + dealerlcodes;
        //var tileService = "http://172.24.16.75:9080/imiservices/services/tile/" + id + "/" + positioncodes + "/" + dealerlcodes;
        return this.http.get(tileService, { headers })
            .map((response: Response) => response.json())
            .catch(this.handleError);
    }
    getChartJson(id?) {
        var validToken: any = JSON.parse(sessionStorage.getItem("CurrentUser")).token;
        var positioncodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedPositionCode;
        var dealerlcodes: any = JSON.parse(sessionStorage.getItem("selectedCodeData")).selectedDealerCode;
        var headers = new Headers();
        headers.append('Authorization', validToken);
        //  var chartService = "./app/resources/dc-json/" + id + "-chart.json";
       // var chartService = "./app/resources/dc-json/column-stack.json";
       //  var chartService = "http://172.24.16.75:9080/imiservices/services/tile/" + id + "/" + positioncodes + "/" + dealerlcodes;
        var chartService = "services/tile/" + id + "/" + positioncodes + "/" + dealerlcodes;
        return this.http.get(chartService, { headers })
            .map((response: Response) => response.json())
            .catch(this.handleError);
    }
    getTableJson(id) {
        var chartService = "./app/resources/json/datatable.json";
        //var chartService = "services/tile/" + id;
        return this.http.get(chartService)
            .map((response: Response) => response.json())
            .catch(this.handleError);
    }

    private handleError(error: Response | any) {
        let errMsg: string = "";
        if (error instanceof Response) {
            const body = error.json() || '';
            const err = body.error || JSON.stringify(body);
            errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
        } else {
            errMsg = error.message ? error.message : error.toString();
        }
        return Observable.throw(errMsg);
    }
}