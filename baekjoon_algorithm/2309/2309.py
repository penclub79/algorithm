# 백준 2309번 일곱 난쟁이
arr = []
for _ in range(9):
  arr.append(int(input()))

arr.sort()
sum_arr=sum(arr)

for i in range(9):
  for j in range(i + 1, 9):

    if sum_arr - (arr[i]+arr[j]) == 100:
      for k in range(9):
        if k==i or k==j:
          continue
        else:
          print(arr[k])
      break
