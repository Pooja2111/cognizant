import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {
  constructor() { }
  showTodayDate(): any {
    //throw new Error("Method not implemented.");
      let ndate = new Date();
      return ndate;
  }

  
}
