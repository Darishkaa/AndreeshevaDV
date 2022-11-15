def magic(matrix):
    summ = sum(matrix[0])
 
    for i in range(len(matrix)):
        temp = 0
        for j in range(len(matrix)):
            temp += matrix[j][i]
        if temp != summ or sum(matrix[i]) != summ:
            return False
    return True
 
 
mat = [[1, 1, 1], [1, 1 , 1], [1, 1, 1]]
print(magic(mat))
