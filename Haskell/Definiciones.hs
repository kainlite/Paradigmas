-- Definiciones.

-- 01 Con patrones
potencia :: Integer -> Integer -> Integer
potencia x 0 = 1
potencia x 1 = x
potencia x n = x * potencia x (n-1)

-- 02 
valAbsoluto :: Integer -> Integer
valAbsoluto 0 = 0
valAbsoluto n = if n > 0 then n else -n

-- 03
sumatoria :: Integer -> Integer
sumatoria 0 = 0
sumatoria n = valAbsoluto n + sumatoria(valAbsoluto(n)-1)

-- 04
divisor :: Integer -> Integer -> Bool
divisor x y = if x == y then True else 
    if x > y then False else divisor x (y-x)

-- 05 Con guardas 
divisor2 :: Integer -> Integer -> Bool
divisor2 x y
    | x == y = True
    | x > y = False
    | otherwise = divisor2 x (y-x)

-- 06
mcd :: Integer -> Integer -> Integer
mcd x y
    | (x `mod` y == 0) = y
    | otherwise = mcd y (x `mod` y)

-- (\ x y -> if x > y then x else y) 2 3
-- (\ x -> if (x `mod` 2 == 0) then True else False) 2

-- 9
-- map(potencia 4) [2,3,4,5]

-- 10
-- map(mcd 2) [1,12,16]
