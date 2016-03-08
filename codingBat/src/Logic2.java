/*
 *  Ejercicios de: CodingBat
 */

/**
 *
 * @author Nicolás Andrés Domínguez Smeed 1ºDAM
 * Ejercicios que sé hacer
 */
public class Logic2 {
 public boolean makeBricks(int small, int big, int goal) {
  if (goal > big*5 + small){ 
  return false;
  }
  if (goal % 5 > small){
   return false;
   }
  return true; 
 }
 public int noTeenSum(int a, int b, int c) {
return fixTeen(a) + fixTeen(b) + fixTeen(c);
}
 
public int fixTeen(int n) {
if(n >= 13 && n <= 19 && n != 15 && n != 16) {
return 0;
} else {
return n;
}
}
public int blackjack(int a, int b) {
    //Sí ambos >21 nadie gana 
    //si "a" >21 pierde
    //Sí "a" o "b" = 21 gana
  if(a > 21 && b > 21){
return 0;
}
if(a >= b && a <= 21){
return a;
}
if(a >= b && a > 21){
return b;
}
if(b >= a && b <= 21){
return b;
}
if(b >= a && b > 21){
return a;
}
else{
return 0;
}
}
public int loneSum(int a, int b, int c) {
    //Si alguno igual al otro el distinto devuelve
  if(a == b && b ==c){
  return 0;
}
if(a == b){
return c;
}
if (b == c){
return a;
}
if (a == c){
return b;
}
return a+ b+ c;
}
public int luckySum(int a, int b, int c) {
    //si "a" igual a 13 no devuelve nada
    //si "b" igual 13 devuelve "a" , si "c" igual a 13 devuelve "b+a" si no
    // devuelve a+b+c
  if(a == 13){
  return 0;
}
if(b == 13){
return a;
}
if(c == 13){
return b + a;
}
return a + b +c;
}

}

 
   
