import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'newpipe'
})
export class NewpipePipe implements PipeTransform {

  transform(val : number) : number {
    return Math.sqrt(val);
  }

}
