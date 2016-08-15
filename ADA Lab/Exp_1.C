//Matrix Multiplication

#include<stdio.h>
#include<time.h>

void main()
{
	int m, n, p, q, i, j, k, sum = 0;
	int A[10][10], B[10][10], C[10][10];
	long time;
	 
	printf("Enter the number of rows and columns of first matrix\n");
	scanf("%d%d", &m, &n);
	printf("Enter the elements of first matrix\n");
	 
	for (i = 0; i < m; i++)
		for (j = 0; j < n; j++)
	    	scanf("%d", &A[i][j]);
	 
	printf("Enter the number of rows and columns of second matrix\n");
	scanf("%d%d", &p, &q);
	 
	if (n != p)
	    printf("Matrices with entered orders can't be multiplied with each other.\n");
	else
	{
	    printf("Enter the elements of second matrix\n");
	 
	    for (i = 0; i < p; i++)
	      for (j = 0; j < q; j++)
	        scanf("%d", &B[i][j]);
	 
	    time = clock();

	    for (i = 0; i < m; i++) {
	    	for (j = 0; j < q; j++) {
	      		multiply[i][j] = 0;
	        	for (k = 0; k < p; k++) {
	          		multiply[i][j] += A[i][k]*B[k][j];
	        	}
	      	}
	    }

	    time = clock() - time;
	 
	    printf("Product of entered matrices:-\n");
	 
	    for (c = 0; c < m; c++) {
	      	for (d = 0; d < q; d++)
	        	printf("%d\t", multiply[c][d]);
	 		printf("\n");
	    }

	    printf("time taken : %d",time);
	}
}