// this code is working
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let N = parseInt(lines.shift());
let V = "";
let arr = [6,2,5,5,4,5,6,3,7,6];
let total = 0;

while(N > 0) {
    V = lines.shift();
    for(let i = 0; i < V.length; i++) {
        total += arr[V[i]];
    }
    console.log(total + " leds");
    total = 0;
    N--;
}