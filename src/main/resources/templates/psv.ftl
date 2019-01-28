<#assign title="psv资源"/>
<#include "common/head_top.ftl"/>
<!-- page specific plugin styles -->
<link rel="stylesheet" href="${ctx}/assets/css/jquery-ui.min.css"/>
<link rel="stylesheet" href="${ctx}/assets/css/bootstrap-datepicker3.min.css"/>
<link rel="stylesheet" href="${ctx}/assets/css/ui.jqgrid.min.css"/>
<link rel="stylesheet" href="${ctx}/assets/css/bootstrap-select.css"/>

<#include "common/head_bottom.ftl"/>
<#include "common/body_top.ftl"/>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">导航</a>
                </li>
                <li class="active">psv游戏下载</li>
            </ul><!-- /.breadcrumb -->

        </div>

        <div class="page-content">
            <div class="ace-settings-container" id="ace-settings-container">


                <div class="ace-settings-box clearfix" id="ace-settings-box"></div>
                <!-- /.ace-settings-box -->
            </div><!-- /.ace-settings-container -->

        <#--<div class="page-header">-->

        <#--</div><!-- /.page-header &ndash;&gt;-->

            <div class="row">


                <div class="col-xs-12 col-sm-12">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-8 col-xs-8">
                                <input type="text" id="keyword" placeholder="资源名称" class="col-xs-3 ">
                                &nbsp;&nbsp;<button type="button" class="btn btn-info btn-sm"
                                                    id="search">查询
                            </button>
                            </div>
                        </div>
                    </form>
                    <table id="grid-table"></table>
                    <div id="grid-pager"></div>
                    <!-- PAGE CONTENT ENDS -->
                </div><!-- /.col -->

                <div id="dialog">
                </div>
<#include "common/body_middle.ftl"/>
<#include "common/bootstrap_modal.ftl">

                <script src="${ctx}/assets/js/bootstrap-datepicker.min.js"></script>
                <script src="${ctx}/assets/js/jquery.jqGrid.min.js"></script>
                <script src="${ctx}/assets/js/grid.locale-en.js"></script>
                <script src="${ctx}/assets/js/bootstrap-select.js"></script>

                <!-- inline scripts related to this page -->
                <script src="${ctx}/assets/js/jquery-ui.min.js"></script>
                <script src="${ctx}/assets/js/jquery.ui.touch-punch.min.js"></script>
                <script src="${ctx}/assets/js/jquery.form.js"></script>
                <script src="${ctx}/js/psv.js?v=0.0.1"></script>

<#include "common/body_bottom.ftl"/>

