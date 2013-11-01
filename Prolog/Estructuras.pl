% Prolog Estructuras de datos

% Utiles
size([], 0).
size([_|T], N) :- size(T, M), N is M + 1.

% 01
parejas([], L, L).
parejas(L, [], L).
parejas([H1|T1], [H2|T2], L3):- size(T1, N1), size(T2, N2), N1 == N2, parejas(T1, T2, L2), L3 = [[H1,H2]|L2].

% 02 
persona(r,1, 2).
persona(a,2, 3).
persona(b,3, 4).
persona(c,4, 5).
persona(d,5, 6).
persona(e,6, 7).
persona(f,7, 8).
persona(g,8, 9).
persona(h,9, 10).
persona(i,10, 11).
persona(j,11, 12).
persona(k,12, 13).
padre(r,a).
padre(r,b).
padre(r,c).
padre(a,d).
padre(a,e).
padre(b,f).
padre(b,g).
padre(e,h).
padre(f,i).
padre(f,j).
padre(g,k).
hijo(X,Y):-padre(Y,X).

descendientes(X,Y):-padre(X,Y).
descendientes(X,Y):-padre(X,Z), descendientes(Z,Y).

ascendientes(X,Y):-padre(Y,X).
ascendientes(X,Y):-padre(Y,Z), ascendientes(X,Z).

% 03
persona2(a, 123, male, 38).
persona2(b, 123, female, 23).
persona2(c, 345, male, 33).
persona2(d, 355, female, 34).
persona2(e, 395, male, 16).
buscarPers(X):- persona2(X, _, _,_).
mostrarMujeres(X):- persona2(X,_,female,_).
mostrarMayores(Y):- persona2(Y,_,male,R), R > 21.
casado(a,b).
casado(c,d).
casadosTel(X,Y):- casado(X,Y), persona2(X,T1,_,_), persona2(Y,T2,_,_), T1 == T2.
visita(a,e).
visita(b,d).
visita(X,Y):- visita(Y,X).

% es la relacion de cachos.
% c(X):- if casado(X, Y), visita(Y, Z), persona2(Z, _, %m).

% 04
ruta(mendoza, sanluis, 280).
ruta(sanjuan, cordoba, 480).
ruta(cordoba, sanjuan, 350).
ruta(sanluis, bsas, 710).
ruta(cordoba, bsas, 540).
ruta(cordoba, misiones, 950).
ruta(cordoba, santafe, 280).
ruta(santafe, misiones, 570).
ruta(mendoza, sanjuan,160).
camino(X, Y, Z):- ruta(X, Y, Z).
camino(X, Y, Z):- ruta(X, C2, R1), camino(C2, Y, R2), Z is R1 + R2.   

camino2(X, Y):- ruta(X, Y, _).
camino2(X, Y):- ruta(X, C2, _), camino2(C2, Y), !.  


camino3(X, Y, Z):- ruta(X, Y, Z).
camino3(X, Y, _):- ruta(X, C2, _), camino3(C2, Y, _), write(C2), write(' '), !.   
