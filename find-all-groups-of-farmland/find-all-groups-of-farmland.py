class Solution:
    def safe(r, c, n, m):
        return r>=0 and r<n and c>=0 and c<m  
    
    def findFarmland(self, land: List[List[int]]) -> List[List[int]]:
          answer=[]
          n,m=len(land), len(land[0])

          for r in range(n):
            for c in range(m):
              i,j = r,c
              if land[i][j]!=1:continue

              if (Solution.safe(i-1, j, n, m) and land[i-1][j]==1) or (Solution.safe(i, j-1, n, m) and land[i][j-1]==1): continue

              answer.append([i,j,i,j])

              while Solution.safe(i+1, j, n, m) and land[i+1][j]==1:
                i+=1
                answer[-1][2]+=1

              while Solution.safe(i, j+1, n, m) and land[i][j+1]==1:
                j+=1
                answer[-1][3]+=1

          return answer