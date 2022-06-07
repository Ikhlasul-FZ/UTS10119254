clc;
clear;
disp('---------Metode Secant---------');
disp('===============================');
f=input('Masukkan Fungsi : ');
x0=input('Masukkan x0 : ');
x1=input('Masukkan x1 : ');
galat1=input('Galat : ');
imax=input('Iterasi Maksimal : ');
iter=0;

fprintf('=================================================================');
fprintf('\n      iterasi       Akar               f(akar)           Galat\n');
fprintf('=================================================================');
for k=1:imax
    iter=iter+1;
    x2=x1-(feval(f,x1)*(x1-x0))/(feval(f,x1)-feval(f,x0));
    galat=abs((x2-x1)/x2);
    x1=x2;
    solusi(k,1)=iter;
    solusi(k,2)=x2;
    solusi(k,3)=galat;
    y=feval(f,x1);
    fprintf('\n %10.0f      %6.10f      %6.10f      %6.10f\n',[iter;x1;y;galat])
    if (galat<galat1  ||  (iter>imax)),break,end;
end
disp('=================================================================');
fprintf('Akarnya adalah = %6.10f\n',x1)    
    
    