import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
// import your generated components here...
import {routes } from './app.routes';

@NgModule({
  declarations: [
    // all your generated components
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    routes
  ],
  providers: [],
  bootstrap: [/* your root component, usually AppComponent */]
})
export class App { }
