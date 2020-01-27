import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { RouterModule} from '@angular/router';
import { MyserviceService } from './myservice.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewCmpComponent } from './new-cmp/new-cmp.component';
import { Pooja5Directive } from './pooja5.directive';
import { ChangeTextDirective } from './change-text.directive';
import { NewpipePipe } from './newpipe.pipe';
@NgModule({
  declarations: [
    AppComponent,
    NewCmpComponent,
    Pooja5Directive,
    ChangeTextDirective,
    NewpipePipe
  ],
  imports: [
    BrowserModule,
   // AppRoutingModule
   FormsModule,
   HttpModule,
    RouterModule.forRoot([
      {
         path: 'new-cmp',
         component: NewCmpComponent
      }
   ])
    
  ],
  providers: [MyserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
