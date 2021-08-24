# Inter-process-communication-using-pipe

In computer science, inter-process communication or interprocess communication (IPC) refers  specifically to the mechanisms an operating system provides to allow the processes to manage  shared data. Typically, applications can use IPC, categorized as clients and servers, where the  client requests data and the server responds to client requests. Many applications are both clients  and servers, as commonly seen in distributed computing. Conceptually, a pipe is a connection  between two processes, such that the standard output from one process becomes the standard input  of the other process. In UNIX Operating System, Pipes are useful for communication between  related processes (inter-process communication). 
• Pipe is one-way communication only i.e we can use a pipe such that One process write to  the pipe, and the other process reads from the pipe. It opens a pipe, which is an area of  main memory that is treated as a “virtual file”. 
• The pipe can be used by the creating process, as well as all its child processes, for reading  and writing. One process can write to this “virtual file” or pipe and another related process  can read from it. 
• If a process tries to read before something is written to the pipe, the process is suspended  until something is written. 
• The pipe system call finds the first two available positions in the process’s open file table  and allocates them for the read and write ends of the pipe. 

Algorithm 
2. Create pipe 
3. Create child process 
4. If the child process is executing, write message to pipe  
5. Else if parent process is executing, read the message from the pipe. 
7. Print the message 
8. Stop 
