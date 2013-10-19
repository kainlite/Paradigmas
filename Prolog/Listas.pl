% Ejercicio listas prolog.

suma([], 0).
suma([H|T], L):- suma(T, Z), L is H + Z.

cantidad([_], 1).
cantidad([_|T], S):- cantidad(T, J), S is J + 1.

ultimo([],_):- fail.
ultimo([Y], Y).
ultimo([_|T], U):- ultimo(T, S), U is S.

concatenar([], [], []).
concatenar([A|[]], [], [A]).
concatenar(T, [J|Y], C):- concatenar([T|J], Y, D), C is D.

inversa([X|[]], [X]).
inversa([H|T], [P|H]):- inversa(T, P).