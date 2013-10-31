% Prolog Estructuras de datos

% Utiles
size([], 0).
size([_|T], N) :- size(T, M), N is M + 1.

% 01
parejas([], L, L).
parejas(L, [], L).
parejas([H1|T1], [H2|T2], L3):- size(T1, N1), size(T2, N2), N1 == N2, parejas(T1, T2, L2), L3 = [[H1,H2]|L2].

% 02 
superior(pers(r,31235630,29),pers(a,30123159,30)).
superior(pers(r,31235630,29),pers(b,20200123,40)).
superior(pers(r,31235630,29),pers(c,10200369,60)).
superior(pers(a,30123159,30),pers(d,26555106,50)).
superior(pers(a,30123159,30),pers(e,6333222,70)).
superior(pers(e,6333222,70),pers(h,3000222,30)).
superior(pers(b,20200123,40),pers(g,20203203,30)).
superior(pers(b,20200123,40),pers(f,6666333,20)).
superior(pers(f,6666333,20),pers(i,9666222,80)).
superior(pers(f,6666333,20),pers(j,10111336,60)).
superior(pers(g,20203203,30),pers(k,11002333,30)).

desc(X,Y):- superior(pers(X,_,_),pers(Y,_,_)).
asc(X,Y):- superior(pers(Y,_,_),pers(X,_,_)).

% 03 
persona(nombre(juan),tel(4215556),sexo(m),edad(22)).
persona(nombre(pedro),tel(4336688),sexo(m),edad(50)).
persona(nombre(laura),tel(4215556),sexo(f),edad(21)).
visita(nombre(juan),nombre(laura)).

existe(X):- persona(nombre(X),_,_,_).
todas(X):-persona(X,_,_,_).
mujeres(X):- persona(nombre(X),_,sexo(f),_).
mayores(X):- persona(nombre(X),_,sexo(m),edad(Y)), Y > 21.
casados(X,Y):- persona(X,tel(S),_,_) , persona(Y,tel(S),_,_).

ruta(sanjuan,cordoba,480).
ruta(cordoba,sanluis,350).
ruta(sanluis,bsas,710).
ruta(cordoba,stafe,280).
ruta(cordoba,misiones,480).
ruta(cordoba,bsas,540).
ruta(misiones,stafe,570).
ruta(mza,sanjuan,160).
ruta(mza,sanluis,280).


camino(X,Y):-ruta(X,Y,_).

dist(X,Y,D):-ruta(X,Y,D).
dist(X,Y,D):-ruta(X,Z,D1),dist(Z,Y,D2), D is D1+D2.
mostrar(X,Y):-ruta(X,Y,_).
mostrar(X,Y):-ruta(X,Z,_),mostrar(Z,Y),write(Z),write(' ').
