const taskInput = document.querySelector("#newtask input");
const taskSection = document.querySelector(".tasks");

taskInput.addEventListener("keyup", (e) => {
    if(e.key == "Enter"){
        createTask();
    }
});

document.querySelector('#push').onclick = function(){
    createTask();
}

function createTask(){
    if(taskInput.value.length == 0){
        alert("The task field is blank. Enter a task name and try again.");
    }else{
        taskSection.innerHTML += 
        `<div class ="task">
            <label id="taskname">
            <input onclick="updateTask(this)" type="checkbox" id="check-task">
            <p>${document.querySelector('#newtask input').value}</p>
            </label>
            <div class ="delete">
                <i class="fa fa-trash"></i>
            </div>
        </div>`;

        var current_tasks = document.querySelectorAll(".delete");
        for(var i=0; i < current_tasks.length; i++){
            current_tasks[i].onclick = function(){
                this.parentNode.remove();
            }
        }

        taskSection.offsetHeight >= 300 ? taskSection.classList.add("overflow") : taskSection.classList.remove("overflow");
    }
}

function updateTask(task){
    let taskItem = task.parentElement.lastElementChild;
    if(task.checked){
        taskItem.classList.add("checked");
    }else{
        taskItem.classList.remove("checked");
    }
}