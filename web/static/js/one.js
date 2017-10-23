/**
 * Created by jing on 2017/10/20.
 */
$('#query').click(function () {
    getAllData();
})

function bindDate(dataList) {
    var table=$('table tbody'),managerList=[];
    table.empty();

    $.each(dataList,function (node) {
        managerList.push('<tr>');
        managerList.push('<td><input type="checkbox" name="managerChecked" value='+node.id+'></td>')
        managerList.push('<td>'+node.manager_name+'</td>');
        managerList.push('</tr>');
    })
    table.append(managerList.join(' '));
}

function getAllData() {
    $.ajax({
        url: '/query',
        type: 'post',
        dataType: 'json',
        success: function (rdata) {
            bindDate(rdata);
        },
        error: function () {
        }
    });
}

