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
data Arbol Integer = Hoja Integer | Nodo (Arbol Integer)(Arbol Integer)

elArbol = Nodo(Nodo (Hoja 45) (Hoja 78) 2) (Nodo (Hoja 12) 3) (Nodo (Hoja 23) (Hoja 13) 4)

cantNodos :: Arbol a -> Integer
cantNodos(Hoja x) = 1
cantNodos(Nodo x y) = 1 + cantNodos x + cantNodos y

mostrarHojas :: Arbol a -> [a]
mostrarHojas(Hoja x) = [x]
mostrarHojas(Nodo x y) = mostrarHojas x ++ mostrarHojas y

prof :: Arbol a -> Integer
prof(Hoja x) = 0
prof(Nodo x y) = 1 + max(prof x)(prof y)

-- elOtroArbol=Nodo(Nodo(Hoja 45)(Hoja 78))(Nodo (Hoja 12)(Nodo(Nodo(Hoja 30)(Hoja 23))(Hoja 13)))
