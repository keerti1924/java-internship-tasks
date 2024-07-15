document.addEventListener('click', (event) => {
    try {
        riskyEventOperation(event);
    } catch (error) {
        console.error('Error during event handling:', error.message);
    }
});

function riskyEventOperation(event) {
    throw new Error('Event handler error!');
}
