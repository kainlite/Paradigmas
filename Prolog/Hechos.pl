% Prolog Hechos y reglas

% 01
par(0).
par(X):- X >= 0 ,Y is X - 2, par(Y).

% 02
suma(0, 0).
suma(N, S):- par(N), T is N - 2, suma(T, Z), S is N + Z.
suma(N, S):- Z is N - 1, suma(Z, S). 

% 03
potencia(B, E, V):- V is B ^ E.

% 04
fibonacci(0, 0).
fibonacci(1, 1).
fibonacci(N, R):- T is N -2, P is N -1, fibonacci(T, S), fibonacci(P, U), R is S + U.

% 05
and(1, 1, 1).
and(0, 0, 0).
and(0, 1, 0).
and(1, 0, 0).

or(0, 1, 1).
or(1, 0, 1).
or(X, X, Y):- and(X, X, Y).

not(0, 1).
not(1, 0).

circuito(Q1, Q2, S):- not(Q1, D1), not(Q2, D2), and(D1, Q2, R1), and(D2, Q1, R2), or(R1, R2, S).

% 06
sintoma(juan, mocos).

sintoma(pedro, mocos).
sintoma(pedro, cansancio).

sintoma(raul, mocos).
sintoma(raul, cansancio).
sintoma(raul, fiebre).

enfermedad(alergia, mocos).

enfermedad(resfrio, mocos).
enfermedad(resfrio, cansancio).

enfermedad(gripe, mocos).
enfermedad(gripe, cansancio).
enfermedad(gripe, fiebre).

diagnostico(P, S, E):- sintoma(P, S), enfermedad(E, S). 