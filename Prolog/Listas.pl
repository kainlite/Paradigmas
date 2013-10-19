% Prolog Tratamiento de listas.

% 01
suma([], 0).
suma([H|T], L):- suma(T, Z), L is H + Z.

% 02
cantidad([_], 1).
cantidad([_|T], S):- cantidad(T, J), S is J + 1.

% 03
ultimo([], _):- fail.
ultimo([Y], Y).
ultimo([_|T], U):- ultimo(T, S), U is S.

% 04
concatenar([], L, L).
concatenar([X|L1], L2, [X|L3]):-concatenar(L1, L2, L3).

% Concatenado para obtener una mejor salida :)
inversa([X|[]], [X]).
inversa([H|T], F):- concatenar(P, [H], F), inversa(T, P).

% 05
sacar(0, [H|_], H).
sacar(P, [_|T], R):- N is P - 1, sacar(N, T, R).

% 06
eliminar([], _, []):- fail.
eliminar([A|T], A, T).
eliminar([H|T], E, R):- R = [H|F], eliminar(T, E, F).

% 07
eliminarTodos([E],E,[]).
eliminarTodos([C],_,[C]).
eliminarTodos([H|T], H, L):- eliminarTodos(T, H, L).
eliminarTodos([H|L1], E, L2):- eliminarTodos(L1, E, L3), L2 = [H|L3].

% 08
intersec([], L, L).
intersec(L, [], L).
intersec([H1|T1], [H2|T2], L3):- intersec(T1, T2, L2), L3 = [H1,H2|L2].

% 09
rotarIzq([], _, []):- fail.
rotarIzq(L, 0, L).
rotarIzq([H|T], 1, R):- concatenar(T, [H], R).
rotarIzq([H|T], N, R):- N > 0, M is N - 1, rotarIzq(T, M, R2), concatenar(R2, [H], R).

% 10
insertarEn(E, [], _, [E]).
insertarEn(E, L, 0, [E|L] ).
insertarEn(E, [H|T], P, R):- P > 0, M is P - 1, R = [H|R2], insertarEn(E, T, M, R2).

% 11
insOrden(E, [], [E]).
insOrden(E, [H|T], D):- E >= H, D = [H|R2], insOrden(E , T, R2).
insOrden(E, [H|T], D):- E =< H, D = [E,H|T].

% 12
ordenada([],[]):- fail.
ordenada([A], [A]).
ordenada([H|T], O):- ordenada(T, S), insOrden(H, S, O).