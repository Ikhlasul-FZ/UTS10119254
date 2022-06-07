function metodesecant;
  clc;
  clear;
E=0.001;
x0=input ('Masukkan X0 : ');
x1=input ('Masukkan X1 : ');
f=inline('exp(2*x)-8*x');
i=0;


disp(' soal : y = e^2x - 8x');
disp('______________________________');
disp(' i         xi         f(xi)   ');
disp('______________________________');
while abs(f(x1))>=E
    x2=x1-f(x1)*(x1-x0)/(f(x1)-f(x0));
    disp(sprintf('%3.0f %12.6f %12.6f %12.6f\n',i,x2,f(x2)));
    x0=x1;
    x1=x2;
    i=i+1;
end
disp('______________________________');
disp(sprintf('Akarnya adalah = %10.8f\n', x2))
