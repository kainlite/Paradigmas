-- Tratamiento de listas.

-- 01 
suma :: Num a => [a] -> a
suma [] = 0
suma n = head(n) + suma(tail(n))

-- 02 
cantidad :: [a] -> Integer
cantidad [] = 0
cantidad n = 1 + cantidad(tail(n))

-- 03 Con guardas
ultimo :: [a] -> a
ultimo a
    | cantidad a == 1 = head(a)
    | cantidad a > 0 = ultimo(tail(a))

ultimo2 :: [a] -> a
ultimo2 a = if (cantidad a == 1) then head(a) else ultimo2(tail(a))

-- 04 
inversa :: [a] -> [a]
inversa [] = []
inversa (a:ax) = inversa ax ++ [a]

-- 05
sacar :: Integer -> [a] -> [a]
sacar n (a:ax) = if n /= 0 then [a] ++ (sacar (n-1) ax) else ax 

sacar2 :: Integer -> [a] -> [a]
sacar2 n (a:ax)
    | n /= 0 = [a] ++ (sacar (n-1) ax)
    | otherwise = ax

-- 06 
eliminar :: Ord a => a -> [a] -> [a]
eliminar a lista
    | lista == [] = []
    | head lista == a = eliminar (a) (tail lista)
    | otherwise = [head lista] ++ eliminar (a) (tail lista)

-- 07
existe :: Eq a => a -> [a] -> Bool
existe a [] = False
existe a (b:bx) = if a == b then True else (existe a bx)

intersec :: Ord a => [a] -> [a] -> [a]
intersec a [] = []
intersec [] a = []
intersec (a:ax) b = if (existe a b) && not (existe a ax) then [a] ++ (intersec ax b) else (intersec ax b)

-- 08
rotarIzq :: Integer -> [a] -> [a]
rotarIzq 0 a = a
rotarIzq n (a:ax) = (rotarIzq (n-1) (ax ++ [a]))

-- 09 
insertarEn :: Integer -> a -> [a] -> [a]
insertarEn 0 a b = a:b
insertarEn n a (b:bx) = if n /= 0 then [b] ++ (insertarEn (n-1) a bx) else ([a] ++ [b] ++ bx)

-- 10
insertOrd :: Ord a => a -> [a] -> [a]
insertOrd a [] = [a]
insertOrd a (b:bx) = if a < b then [a] ++ [b] ++ bx else [b] ++ (insertOrd a bx)

-- 11
ordenada :: Ord a => [a] -> [a]
ordenada [] = []
ordenada (a:ax) = (insertOrd a (ordenada ax))
