$(function ($) {
    $("#ds-modal").modal("show");

    var grid_selector = "#grid-table";
    var pager_selector = "#grid-pager";
    $(grid_selector).jqGrid({
        url: "/index/list",
        subGrid: false,
        datatype: "json",
        height: 'auto',
        colNames: ['序列号', '消息类型', '标题', '描述', '发布日期'],
        colModel: [
            {name: 'id', index: 'id', width: 30, hidden:true, editable: true, key: true},
            {name: 'type', index: 'type', width: 30},
            {name: 'title', index: 'title', width: 80},
            {name: 'description', index: 'description', width: 140},
            {name: 'createDate', index: 'createDate', width: 30}
        ],
        jsonReader: {
            root: "list",
            page: "pageNum",
            total: "pages",
            records: "total"
        },
        pgtext: "第 {0} 页，共 {1}页",
        recordtext: "第 {0} 到 {1} 共 {2} 条",
        viewrecords: true,
        rowNum: 15,
        pager: pager_selector,
        altRows: true,
        multiselect: false,
        autowidth: true,
        //multikey: "ctrlKey",
        //toppager: true,
        multiboxonly: true,
        loadComplete: function () {
            var table = this;
            setTimeout(function () {
                updatePagerIcons(table);
                enableTooltips(table);
            }, 0);
        },
        caption: "",
        autowidth: true
    });
    $(window).triggerHandler('resize.jqGrid');
    //操作按钮，true为显示，false为隐藏，xxxfunc:调用函数,xxxicon:图标
    jQuery(grid_selector).jqGrid('navGrid', pager_selector,
        {
            edit: false,
            edittext: '修改',
            edittitle: '修改管理员用户',
            add: false,
            addtext: '添加',
            addtitle: '添加管理员用户',
            addicon: 'ace-icon fa fa-plus-circle purple',
            del: false,
            deltext: '回收站',
            deltitle: '删除至回收站',
            search: false,
            refresh: true,
            refreshtitle: '刷新',
            refreshicon: 'ace-icon fa fa-refresh green',
            alertcap: '提示',
            alerttext: '请选择一条记录'
        }
    );

    //更新分页按钮
    function updatePagerIcons(table) {
        var replacement =
            {
                'ui-icon-seek-first': 'ace-icon fa fa-angle-double-left bigger-140',
                'ui-icon-seek-prev': 'ace-icon fa fa-angle-left bigger-140',
                'ui-icon-seek-next': 'ace-icon fa fa-angle-right bigger-140',
                'ui-icon-seek-end': 'ace-icon fa fa-angle-double-right bigger-140'
            };
        $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function () {
            var icon = $(this);
            var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
            if ($class in replacement) icon.attr('class', 'ui-icon ' + replacement[$class]);
        })
    }

    function enableTooltips(table) {
        $('.navtable .ui-pg-button').tooltip({container: 'body'});
        $(table).find('.ui-pg-div').tooltip({container: 'body'});
    }

    $(document).one('ajaxloadstart.page', function (e) {
        $.jgrid.gridDestroy(grid_selector);
        $('.ui-jqdialog').remove();
    });

    $.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
        _title: function (title) {
            var $title = this.options.title || '&nbsp;'
            if (("title_html" in this.options) && this.options.title_html == true)
                title.html($title);
            else title.text($title);
        }
    }));

    //模糊查询
    $("#search").bind("click", function () {
        var keyword = $("#keyword").val();
        $("#grid-table").jqGrid("setGridParam", {page: 1});
        $("#grid-table").jqGrid('setGridParam', {
            postData: {"keyword": encodeURI(keyword)}
        }).trigger('reloadGrid');

    });


});