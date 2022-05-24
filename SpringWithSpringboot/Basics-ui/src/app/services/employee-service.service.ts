import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../datamodels/Employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  private url: string;
  constructor(private http: HttpClient) {
    this.url = "http://localhost:8080/"
  }
  public getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.url);
  }
  public saveDetails(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.url, employee);
  }
}
