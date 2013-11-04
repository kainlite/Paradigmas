-- Estructuras

-- 01
parejas :: [a] -> [a] -> [(a, a)]
parejas a [] = []
parejas [] a = []
parejas (a:ax) (b:bx) = if (length ax) == (length bx) then [(a,b)] ++ (parejas ax bx) else []

-- 02 
aplica :: (Integer -> Integer -> Integer) -> [Integer] -> [Integer]
aplica f[] = []
aplica f(a:b)=f(last(a:b)) a:aplica f b

-- 03 
type Entrada = (Bool,Bool)
_and :: Entrada -> Bool
_and (a, b)
    | a == True && b == True = True
    | a == True && b == False = False
    | a == False && b == True = False
    | a == False && b == False = False

-- Con Patrones
-- type Entrada = (Bool, Bool)
-- _and :: Entrada -> Bool
-- _and (True, True) = True
-- _and (True, False) = False
-- _and (False, True) = False
-- _and (False, False) = False

_or :: Entrada -> Bool
_or (a, b)
    | a == True && b == True = True 
    | a == True && b == False = True
    | a == False && b == True = True 
    | a == False && b == False = False

_not :: Bool -> Bool
_not a 
    | a == True = False
    | a == False = True

circuito :: Entrada -> Bool
circuito (q1, q2) = _or((_and ((_not q1), q2)), (_and ((_not q2), q1)))

-- 04
data Arbol a = Rama (Arbol a) (Arbol a) | Hoja a

elArbol = Rama (Rama (Hoja 45) (Hoja 78))
    (Rama (Hoja 12) (Rama (Hoja 23) (Hoja 13)))

elOtroArbol = Rama (Rama (Hoja 45) (Hoja 78))
    (Rama (Hoja 12) (Rama (Rama (Hoja 30) (Hoja 23)) (Hoja 13)))

cantidad :: Arbol a -> Integer
cantidad (Hoja x) = 1
cantidad (Rama x y) = cantidad x + cantidad y

mostrarHojas :: Arbol a -> [a]
mostrarHojas(Hoja x) = [x]
mostrarHojas(Rama x y) = mostrarHojas x ++ mostrarHojas y

prof :: Arbol a -> Integer
prof(Hoja x) = 0
prof(Rama x y) = 1 + max (prof x) (prof y)
