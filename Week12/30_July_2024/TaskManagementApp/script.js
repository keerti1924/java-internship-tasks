class Task {
    constructor(description) {
        this.description = description;
        this.completed = false;
    }

    toggleComplete() {
        this.completed = !this.completed;
    }
    
    updateDescription(newDescription) {
        this.description = newDescription;
    }
}

class TaskManager {
    constructor() {
        this.tasks = [];
    }

    addTask(description) {
        const task = new Task(description);
        this.tasks.push(task);
        this.displayTasks();
    }

    deleteTask(index) {
        this.tasks.splice(index, 1);
        this.displayTasks();
    }

    toggleTaskCompletion(index) {
        this.tasks[index].toggleComplete();
        this.displayTasks();
    }

    updateTaskDescription(index, newDescription) {
        this.tasks[index].updateDescription(newDescription);
        this.displayTasks();
    }

    displayTasks() {
        const taskList = document.getElementById('taskList');
        taskList.innerHTML = '';

        this.tasks.forEach((task, index) => {
            const taskItem = document.createElement('div');
            taskItem.className = `task ${task.completed ? 'completed' : ''}`;
            taskItem.innerHTML = `
              <div class="row align-items-center justify-content-between border mb-2">
                <div class="col-auto">
                  <div class="form-check">
                    <input class="form-check-input complete-btn" type="checkbox" ${task.completed ? 'checked' : ''} onclick="taskManager.toggleTaskCompletion(${index})">
                    <span>${task.description}</span>
                  </div>
                </div>
                <div class="col-auto">
                    <button class="btn border-none text-primary edit-btn" onclick="editTask(${index})"><i class="fa fa-edit"></i></button>
                  <button class="btn border-none text-danger fw-bold delete-btn" onclick="taskManager.deleteTask(${index})"><i class="fa fa-trash-alt"></i></button>
                </div>
              </div>
            `;
            taskList.appendChild(taskItem);
          });
    }
}

const taskManager = new TaskManager();

document.getElementById('addTaskBtn').addEventListener('click', () => {
    const taskInput = document.getElementById('taskInput');
    const taskDescription = taskInput.value.trim();

    if (taskDescription) {
        taskManager.addTask(taskDescription);
        taskInput.value = '';
    }
});



function editTask(index) {
    const taskList = document.getElementById('taskList');
    const taskItem = taskList.children[index];
    const taskDescription = taskManager.tasks[index].description;

    taskItem.innerHTML = `
      <div class="row align-items-center justify-content-between my-2">
        <div class="col-auto">
          <input type="text" class="w-100 form-control" id="editInput${index}" value="${taskDescription}">
        </div>
        <div class="col-auto">
          <button class="btn btn-success save-btn" onclick="saveTask(${index})">Save</button>
          <button class="btn btn-secondary cancel-btn" onclick="taskManager.displayTasks()">Cancel</button>
        </div>
      </div>
    `;
  }

  function saveTask(index) {
    const newDescription = document.getElementById(`editInput${index}`).value.trim();
    if (newDescription) {
      taskManager.updateTaskDescription(index, newDescription);
    }
  }
