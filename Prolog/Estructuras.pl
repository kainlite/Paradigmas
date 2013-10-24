% Prolog Estructuras de datos

% Utiles
size([], 0).
size([_|T], N) :- size(T, M), N is M + 1.

% 01
parejas([], L, L).
parejas(L, [], L).
parejas([H1|T1], [H2|T2], L3):- size(T1, N1), size(T2, N2), N1 == N2, parejas(T1, T2, L2), L3 = [[H1,H2]|L2].

% 02 
persona(pepe, 1, 70).

persona(juan, 2, 50).
persona(pedro, 3, 50).
persona(pablo, 4, 50).

persona(maria, 5, 30).
persona(ana, 6, 30).
persona(lucia, 7, 30).
persona(sofia, 8, 30).

persona(ivan, 9, 10).
persona(lara, 10, 10).
persona(luis, 11, 10).
persona(luna, 12, 10).

padre(pepe, juan).
padre(pepe, pedro).
padre(pepe, pablo).

padre(juan, maria).
padre(juan, ana).

padre(pedro, lucia).
padre(pedro, sofia).

padre(ana, lara).
padre(ana, luis).
padre(lucia, luna).
padre(sofia, ivan).

% X es ancestro de Y ?
% findall(X,descend(martha,X),Z).
ancestro(X, Y):- padre(X, Y).


% X es descendencia de Y ?
descendencia(Y, Z):- findall(X, descendencia(Y, X), Z).
descendencia(X, Z):- padre(Y, X), padre(X, Z).
