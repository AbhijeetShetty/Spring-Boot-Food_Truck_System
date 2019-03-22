import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

import { User } from '../models/user';

const HttpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
};
@Injectable({
  providedIn: 'root'
})
export class UserService {
  url: string;
  constructor(private http: HttpClient) { }

  registerUser(user: User): Observable<any> {
    this.url = "//localhost:8080/foodtruck/users/";
    return this.http.post(this.url, user, HttpOptions);
  }

}